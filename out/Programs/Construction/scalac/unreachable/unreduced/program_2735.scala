package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Byte, C], c: C) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, (Int,Int)]], C]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, (Int,Int)]], CC_A[T_A[Int, Int]]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, (Int,Int)]], CC_A[T_A[Int, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, (Int,Int)]], CC_A[T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)