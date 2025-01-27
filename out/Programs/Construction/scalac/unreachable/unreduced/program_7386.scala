package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[Byte, D]
case class CC_B(a: CC_A[Int], b: (T_A[Byte, Char],CC_A[Boolean]), c: (((Char,Byte),Boolean),T_B[Byte])) extends T_A[Byte, T_A[Byte, T_A[Byte, Char]]]
case class CC_C(a: T_B[Char], b: CC_A[T_A[Byte, CC_B]], c: Boolean) extends T_B[Char]
case class CC_D(a: T_B[Char], b: T_A[T_B[Char], T_B[CC_C]]) extends T_B[Char]
case class CC_E(a: ((CC_B,CC_D),(CC_D,CC_B)), b: T_B[Char]) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_E(((_,_),(_,_)), _)