package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D](a: D, b: T_A[T_A[Int, D], D], c: D) extends T_A[Int, D]
case class CC_C(a: T_A[Int, Char], b: T_A[Int, (Byte,Char)]) extends T_A[Int, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_B((_,_), _, (_,_))) => 2 
}
}
// This is not matched: CC_C(_, CC_A())