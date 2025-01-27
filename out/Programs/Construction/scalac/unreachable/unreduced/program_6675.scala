package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D]) extends T_A[D, E]
case class CC_B(a: T_A[T_A[Boolean, (Char,Byte)], T_A[Int, Boolean]], b: T_A[CC_A[(Boolean,Int), Int], (Byte,Byte)], c: T_A[T_A[Char, Int], ((Int,Byte),Char)]) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Byte]], Int]
case class CC_C(a: CC_B, b: T_B[T_B[CC_B]], c: Byte) extends T_B[T_B[CC_B]]
case class CC_D(a: T_A[(CC_B,CC_B), T_B[Int]], b: CC_B, c: T_A[(Byte,CC_B), T_A[Char, CC_C]]) extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_A(_), _), CC_C(CC_B(_, _, _), CC_C(_, _, _), _), _) => 0 
  case CC_C(CC_B(_, CC_A(_), _), CC_C(CC_B(_, _, _), CC_D(_, _, _), _), _) => 1 
  case CC_C(CC_B(_, CC_A(_), _), CC_D(_, CC_B(_, _, _), CC_A(_)), _) => 2 
  case CC_D(_, _, _) => 3 
}
}