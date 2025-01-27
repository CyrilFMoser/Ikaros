package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Byte, Byte],T_A[Char, Byte]), b: Boolean) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C(a: T_B[(Int,Char)], b: T_A[CC_B[(Int,Boolean)], T_A[CC_B[(Int,Boolean)], CC_B[(Int,Boolean)]]]) extends T_A[T_A[T_A[(Char,Int), Byte], T_A[T_A[(Char,Int), Byte], T_A[(Char,Int), Byte]]], T_A[T_A[T_A[(Char,Int), Byte], T_A[T_A[(Char,Int), Byte], T_A[(Char,Int), Byte]]], T_A[T_A[(Char,Int), Byte], T_A[T_A[(Char,Int), Byte], T_A[(Char,Int), Byte]]]]]
case class CC_D(a: T_A[CC_C, T_A[CC_C, CC_C]], b: T_B[CC_C]) extends T_B[CC_C]

val v_a: T_A[T_A[T_A[(Char,Int), Byte], T_A[T_A[(Char,Int), Byte], T_A[(Char,Int), Byte]]], T_A[T_A[T_A[(Char,Int), Byte], T_A[T_A[(Char,Int), Byte], T_A[(Char,Int), Byte]]], T_A[T_A[(Char,Int), Byte], T_A[T_A[(Char,Int), Byte], T_A[(Char,Int), Byte]]]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A((_,_), true)) => 1 
  case CC_C(_, CC_A((_,_), false)) => 2 
  case CC_C(_, CC_B()) => 3 
}
}
// This is not matched: CC_A(_, _)