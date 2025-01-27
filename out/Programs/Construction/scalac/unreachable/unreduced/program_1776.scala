package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[CC_A[Boolean]], b: T_B[T_B[Boolean]]) extends T_B[T_B[Boolean]]
case class CC_C(a: (T_A[CC_B],CC_B), b: T_A[T_A[(Byte,Boolean)]]) extends T_B[T_B[Boolean]]
case class CC_D(a: T_B[T_A[CC_B]], b: CC_B, c: CC_C) extends T_B[T_B[Boolean]]

val v_a: T_B[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_B(_, _)) => 0 
  case CC_B(CC_A(_), CC_C(_, _)) => 1 
  case CC_C(_, CC_A(_)) => 2 
  case CC_D(_, _, CC_C(_, _)) => 3 
}
}
// This is not matched: CC_B(CC_A(_), CC_D(_, _, _))