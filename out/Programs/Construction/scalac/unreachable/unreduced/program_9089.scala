package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_B[T_B[T_A]], c: Char) extends T_A
case class CC_B[B](a: T_A) extends T_A
case class CC_C(a: T_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}