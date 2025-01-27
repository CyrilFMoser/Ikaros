package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Char]], b: T_A[T_B[(Char,Int)], T_A[(Boolean,Boolean), Byte]], c: T_A[Byte, T_A[Boolean, Byte]]) extends T_A[(T_B[Boolean],T_A[Int, Byte]), T_B[T_A[Byte, Char]]]
case class CC_B(a: T_A[Byte, Boolean]) extends T_A[(T_B[Boolean],T_A[Int, Byte]), T_B[T_A[Byte, Char]]]
case class CC_C[D](a: Boolean, b: T_B[D]) extends T_A[Char, D]
case class CC_D[E](a: CC_C[E]) extends T_B[T_A[Char, CC_C[CC_A]]]
case class CC_E(a: (T_B[CC_B],CC_C[(Int,Byte)])) extends T_B[T_A[Char, CC_C[CC_A]]]

val v_a: T_B[T_A[Char, CC_C[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E((_,CC_C(_, _))) => 1 
}
}