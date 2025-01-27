package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: C) extends T_A[C]
case class CC_B() extends T_A[T_A[T_B[(Int,Boolean)]]]
case class CC_C(a: Boolean, b: CC_B, c: Char) extends T_A[T_A[T_B[(Int,Boolean)]]]
case class CC_D() extends T_B[Byte]

val v_a: T_A[T_A[T_B[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B(), _) => 2 
}
}