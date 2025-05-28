package jamdoggie.swaymod.mixininterfaces;

public interface IPlayerMixin
{
	float _getRenderArmPitch();
	void _setRenderArmPitch(float pitch);

	float _getPrevRenderArmPitch();
	void _setPrevRenderArmPitch(float pitch);

	float _getRenderArmYaw();
	void _setRenderArmYaw(float yaw);

	float _getPrevRenderArmYaw();
	void _setPrevRenderArmYaw(float yaw);
}
