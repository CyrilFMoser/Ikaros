package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Int]]) extends T_A[(Byte,Boolean)]
case class CC_B(a: CC_A, b: Int, c: CC_A) extends T_A[(Byte,Boolean)]

val v_a: T_A[(Byte,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}