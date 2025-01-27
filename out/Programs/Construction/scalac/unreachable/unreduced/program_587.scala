package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Byte], Int], b: T_B[T_B[Char, Char], T_B[Char, Int]], c: T_B[T_B[Char, Boolean], T_A[Byte]]) extends T_A[T_A[T_B[Int, Char]]]
case class CC_B[D](a: T_A[D], b: (T_A[CC_A],(CC_A,CC_A)), c: D) extends T_A[D]
case class CC_C() extends T_A[T_A[T_B[Int, Char]]]
case class CC_D(a: (T_A[Char],CC_B[CC_C]), b: T_A[Int], c: CC_C) extends T_B[(CC_A,(CC_A,CC_C)), Char]

val v_a: T_A[T_A[T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, (_,_), CC_B(_, _, _))