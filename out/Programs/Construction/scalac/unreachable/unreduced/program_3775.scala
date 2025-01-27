package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Boolean,Boolean), Char],T_A[Int, Char]), b: Byte, c: T_A[C, C]) extends T_A[T_A[(Char,Boolean), T_A[Char, Char]], C]
case class CC_B[D]() extends T_A[T_A[(Char,Boolean), T_A[Char, Char]], D]
case class CC_C(a: (T_A[(Byte,Byte), (Byte,Boolean)],(Boolean,Char)), b: CC_B[(Int,Char)], c: CC_A[T_A[Char, Int]]) extends T_A[T_A[(Char,Boolean), T_A[Char, Char]], CC_B[Byte]]

val v_a: T_A[T_A[(Char,Boolean), T_A[Char, Char]], T_A[T_A[(Char,Boolean), T_A[Char, Char]], CC_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}