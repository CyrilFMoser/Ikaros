package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte) extends T_A[T_A[T_B[Char]]]
case class CC_B[C](a: Byte, b: C) extends T_B[C]
case class CC_C[D](a: (T_B[CC_A],((Int,Byte),CC_A)), b: T_A[CC_A], c: T_A[D]) extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, true) => 0 
  case CC_B(_, false) => 1 
  case CC_C((CC_B(_, _),(_,_)), _, _) => 2 
  case CC_C((CC_C(_, _, _),(_,_)), _, _) => 3 
}
}