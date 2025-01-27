package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: (Byte,T_B), c: T_A[T_A[Boolean]]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, (_,_), _)