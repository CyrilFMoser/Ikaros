package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Char],(Byte,Byte)), b: Char) extends T_A[C]
case class CC_B[D](a: D, b: ((Int,Byte),T_A[(Byte,Byte)]), c: T_B[D]) extends T_A[D]
case class CC_C[E](a: T_A[Int], b: (Boolean,CC_A[Int])) extends T_A[E]
case class CC_D(a: CC_C[T_A[Int]], b: Boolean) extends T_B[CC_A[CC_B[Char]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_A((_,_), _), _) => 1 
  case CC_C(CC_B(_, _, _), _) => 2 
  case CC_C(CC_C(_, _), _) => 3 
}
}
// This is not matched: CC_B(_, _, _)