package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: T_A[(Char,Int)], c: T_A[T_A[Char]]) extends T_A[Byte]
case class CC_B[C](a: T_B[C], b: CC_A) extends T_B[C]
case class CC_C(a: (T_B[CC_A],(Char,CC_A)), b: CC_A, c: CC_B[Byte]) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_B(CC_B(CC_C(_, _, _), _), CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_B(CC_C(_, _, _), CC_A(CC_A(_, _, _), _, _)) => 2 
  case CC_C((CC_B(_, _),(_,_)), _, _) => 3 
}
}