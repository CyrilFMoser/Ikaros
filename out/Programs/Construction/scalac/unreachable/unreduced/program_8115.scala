package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_B]
case class CC_B(a: T_A[CC_A], b: CC_A, c: (T_B,CC_A)) extends T_B
case class CC_C(a: T_B, b: CC_A, c: T_A[T_B]) extends T_B
case class CC_D(a: Boolean, b: (Byte,(CC_B,CC_C)), c: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _) => 0 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _) => 2 
  case CC_A(CC_C(CC_D(_, _, _), CC_A(_, _), CC_A(_, _)), _) => 3 
  case CC_A(CC_D(true, (_,_), CC_A(_, _)), _) => 4 
  case CC_A(CC_D(false, (_,_), CC_A(_, _)), _) => 5 
}
}