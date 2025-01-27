package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[Byte]) extends T_A[(T_B[Int],Boolean), D]
case class CC_B[E](a: E) extends T_B[E]
case class CC_C(a: (T_A[Byte, Char],CC_A[Byte]), b: T_B[CC_B[Byte]], c: (T_B[Int],CC_A[Int])) extends T_B[Int]
case class CC_D(a: T_B[Int], b: CC_A[CC_B[CC_C]], c: Char) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((_,CC_A(_)), CC_B(CC_B(_)), (CC_B(_),CC_A(_))) => 1 
  case CC_C((_,CC_A(_)), CC_B(CC_B(_)), (CC_D(_, _, _),CC_A(_))) => 2 
  case CC_D(CC_B(_), _, _) => 3 
  case CC_D(CC_C(_, CC_B(_), (_,_)), _, _) => 4 
  case CC_D(CC_D(_, _, _), _, _) => 5 
}
}
// This is not matched: CC_C((_,CC_A(_)), CC_B(CC_B(_)), (CC_C(_, _, _),CC_A(_)))