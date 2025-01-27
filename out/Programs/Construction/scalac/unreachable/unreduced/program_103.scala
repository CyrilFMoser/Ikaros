package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[T_A[Boolean, (Byte,Int)], T_A[Int, Boolean]]]
case class CC_B(a: T_A[((Char,Int),Int), CC_A[Char]]) extends T_A[CC_A[T_A[Char, Int]], T_A[T_A[Boolean, (Byte,Int)], T_A[Int, Boolean]]]
case class CC_C(a: CC_A[CC_A[CC_B]], b: CC_A[T_A[CC_B, CC_B]]) extends T_A[CC_A[T_A[Char, Int]], T_A[T_A[Boolean, (Byte,Int)], T_A[Int, Boolean]]]

val v_a: T_A[CC_A[T_A[Char, Int]], T_A[T_A[Boolean, (Byte,Int)], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}