package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Char, C]
case class CC_B(a: T_A[CC_A[Char], T_A[Char, Byte]], b: Char, c: T_A[CC_A[Boolean], T_A[Char, Char]]) extends T_A[Char, (CC_A[Int],CC_A[Int])]
case class CC_C() extends T_A[Char, (CC_A[Int],CC_A[Int])]

val v_a: T_A[Char, (CC_A[Int],CC_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()