package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: T_A[C, C], c: D) extends T_A[D, C]
case class CC_B[E](a: T_A[E, E], b: (T_A[Int, (Boolean,Int)],Boolean)) extends T_A[T_A[E, E], E]
case class CC_C(a: T_A[T_A[CC_B[Int], CC_B[Int]], CC_B[Int]], b: T_A[CC_B[Byte], CC_B[Boolean]], c: T_A[CC_A[Byte, Int], Int]) extends T_A[T_A[T_A[Char, (Byte,Boolean)], T_A[Char, (Byte,Boolean)]], T_A[Char, (Byte,Boolean)]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
}
}