package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, Int], (Boolean,Int)], T_A[T_A[Byte, Char], T_A[Int, (Char,Char)]]]
case class CC_B() extends T_A[T_A[T_A[Int, Int], (Boolean,Int)], T_A[T_A[Byte, Char], T_A[Int, (Char,Char)]]]
case class CC_C(a: CC_A, b: CC_B, c: T_A[CC_B, CC_B]) extends T_A[T_A[T_A[Int, Int], (Boolean,Int)], T_A[T_A[Byte, Char], T_A[Int, (Char,Char)]]]

val v_a: T_A[T_A[T_A[Int, Int], (Boolean,Int)], T_A[T_A[Byte, Char], T_A[Int, (Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}