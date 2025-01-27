package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Char, Int], T_B[Int, (Int,Char)]]]
case class CC_B(a: CC_A) extends T_A[T_B[T_B[Char, Int], T_B[Int, (Int,Char)]]]
case class CC_C(a: T_A[CC_B], b: (T_B[CC_B, Int],T_A[CC_A])) extends T_A[T_B[T_B[Char, Int], T_B[Int, (Int,Char)]]]

val v_a: T_A[T_B[T_B[Char, Int], T_B[Int, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, (_,_)) => 1 
}
}
// This is not matched: CC_B(CC_A())