package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Boolean, Char], T_B[Boolean, Int]], b: T_B[T_A[Int, Char], T_A[Int, (Boolean,Char)]]) extends T_A[Int, T_A[T_B[Int, Char], T_B[Char, Byte]]]
case class CC_B(a: T_B[Byte, T_B[(Int,Boolean), CC_A]], b: (T_B[CC_A, CC_A],(CC_A,Int))) extends T_A[Int, T_A[T_B[Int, Char], T_B[Char, Byte]]]
case class CC_C() extends T_A[Int, T_A[T_B[Int, Char], T_B[Char, Byte]]]
case class CC_D[E]() extends T_B[T_A[T_A[CC_C, CC_C], (CC_A,CC_C)], CC_B]
case class CC_E[F]() extends T_B[(T_A[CC_A, (Char,Char)],CC_A), F]

val v_a: T_A[Int, T_A[T_B[Int, Char], T_B[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}