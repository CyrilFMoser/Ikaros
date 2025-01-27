package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, T_B[Char, Byte]], b: T_A[T_A[Boolean]], c: Int) extends T_A[(T_A[Int],T_A[Int])]
case class CC_B() extends T_A[(T_A[Int],T_A[Int])]
case class CC_C[D](a: Char, b: CC_A, c: (CC_A,CC_B)) extends T_B[(CC_A,T_B[Boolean, CC_B]), D]
case class CC_D[E]() extends T_B[(CC_A,T_B[Boolean, CC_B]), E]

val v_a: T_B[(CC_A,T_B[Boolean, CC_B]), Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _), _) => 0 
  case CC_D() => 1 
}
}