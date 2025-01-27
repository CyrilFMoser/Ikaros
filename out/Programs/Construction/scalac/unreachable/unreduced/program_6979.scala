package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: (T_A[Byte, Byte],T_A[(Char,Char), Byte])) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Byte, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_A[Char], b: (T_A[(Char,Char), Char],T_A[Int, Byte]), c: Char) extends T_A[T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]], T_A[T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]], T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, (_,_)), _) => 0 
  case CC_A(CC_B(_, CC_A(_, _)), _) => 1 
  case CC_A(CC_B(_, CC_B(_, _)), _) => 2 
  case CC_B(_, _) => 3 
}
}