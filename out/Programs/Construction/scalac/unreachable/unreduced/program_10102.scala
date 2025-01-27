package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E], c: Char) extends T_A[T_B[E, E], E]
case class CC_B(a: T_B[T_B[Char, (Char,Int)], CC_A[(Boolean,Char)]], b: CC_A[T_A[Boolean, Char]]) extends T_B[T_B[T_A[Byte, (Int,Int)], T_B[Int, Int]], T_A[T_B[T_B[Boolean, Boolean], T_B[Boolean, Boolean]], T_B[Boolean, Boolean]]]
case class CC_C(a: Boolean) extends T_B[T_B[T_A[Byte, (Int,Int)], T_B[Int, Int]], T_A[T_B[T_B[Boolean, Boolean], T_B[Boolean, Boolean]], T_B[Boolean, Boolean]]]
case class CC_D(a: Char, b: T_A[T_B[(CC_C,Int), (CC_C,Int)], (CC_C,Int)]) extends T_B[T_B[T_A[Byte, (Int,Int)], T_B[Int, Int]], T_A[T_B[T_B[Boolean, Boolean], T_B[Boolean, Boolean]], T_B[Boolean, Boolean]]]

val v_a: T_B[T_B[T_A[Byte, (Int,Int)], T_B[Int, Int]], T_A[T_B[T_B[Boolean, Boolean], T_B[Boolean, Boolean]], T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(true) => 0 
  case CC_C(false) => 1 
  case CC_D(_, CC_A((_,_), _, _)) => 2 
}
}
// This is not matched: CC_B(_, _)