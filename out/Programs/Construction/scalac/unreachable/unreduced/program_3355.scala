package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C], c: T_B[C]) extends T_A[C]
case class CC_B() extends T_A[T_A[CC_A[Char]]]
case class CC_C(a: T_B[Int], b: (T_B[CC_B],Byte), c: T_A[T_B[Byte]]) extends T_A[T_A[CC_A[Char]]]
case class CC_D() extends T_B[(T_A[CC_C],CC_B)]
case class CC_E(a: CC_A[(CC_B,CC_C)], b: CC_D) extends T_B[(T_A[CC_C],CC_B)]

val v_a: T_A[T_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(_, _, CC_A(_, _, _)), _) => 2 
  case CC_B() => 3 
  case CC_C(_, _, _) => 4 
}
}