package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_A[(Byte,(Boolean,Boolean))], c: T_B[T_A[Int]]) extends T_A[(T_A[Byte],T_A[Byte])]
case class CC_B(a: CC_A) extends T_A[T_B[(Char,CC_A)]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_B[(Char,CC_A)]]
case class CC_D[C](a: T_A[C]) extends T_B[C]
case class CC_E() extends T_B[CC_A]

val v_a: T_A[T_B[(Char,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_, _) => 1 
}
}