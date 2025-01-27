package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Byte,T_B), b: T_B) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_B, b: T_A[T_A[T_B]], c: T_B) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(CC_A(_, _)), _, _) => 2 
  case CC_C(CC_B(CC_B(_)), _, _) => 3 
  case CC_C(CC_B(CC_C(_, _, _)), _, _) => 4 
}
}
// This is not matched: CC_A((_,_), _)