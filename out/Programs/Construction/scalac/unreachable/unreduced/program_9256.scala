package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], C]
case class CC_B(a: CC_A[Int]) extends T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], T_A[T_A[Char, Int], T_A[Boolean, Int]]]
case class CC_C(a: Byte) extends T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], T_A[T_A[Char, Int], T_A[Boolean, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], T_A[T_A[Char, Int], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, 12)) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _, _)