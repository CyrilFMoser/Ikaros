package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, (Int,Boolean)], (T_A,(Boolean,Byte))], b: Int) extends T_A
case class CC_B[C](a: T_B[Int, C]) extends T_B[Int, C]
case class CC_C[D, E](a: T_A, b: D) extends T_B[Int, D]
case class CC_D(a: Boolean) extends T_B[Int, CC_B[CC_A]]

val v_a: T_B[Int, CC_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, 12), _) => 1 
  case CC_D(_) => 2 
}
}
// This is not matched: CC_C(CC_A(_, _), _)