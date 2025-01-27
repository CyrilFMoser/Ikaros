package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],T_B[T_A, Byte])) extends T_A
case class CC_B(a: (Int,CC_A), b: CC_A, c: T_B[T_B[(Int,Int), T_A], T_B[CC_A, T_A]]) extends T_A
case class CC_C(a: (Char,Char), b: T_B[T_A, T_A], c: CC_B) extends T_A
case class CC_D[C](a: CC_A, b: Byte, c: Char) extends T_B[T_A, C]
case class CC_E[D](a: Byte, b: T_B[T_A, D]) extends T_B[T_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C((_,_), CC_D(CC_A(_), _, _), CC_B(_, _, _)) => 2 
  case CC_C((_,_), CC_E(_, CC_E(_, _)), CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_C((_,_), CC_E(_, CC_D(_, _, _)), CC_B(_, _, _))