package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Boolean,Char), T_A[Boolean, (Byte,Char)]]]
case class CC_B(a: T_A[CC_A[Boolean], T_A[(Char,Char), Int]], b: T_A[T_A[Char, Boolean], Int]) extends T_A[T_A[T_A[Int, Boolean], CC_A[Int]], T_A[(Boolean,Char), T_A[Boolean, (Byte,Char)]]]
case class CC_C(a: Char, b: CC_A[CC_B], c: T_A[T_A[CC_B, (Boolean,Int)], CC_B]) extends T_A[T_A[T_A[Int, Boolean], CC_A[Int]], T_A[(Boolean,Char), T_A[Boolean, (Byte,Char)]]]

val v_a: T_A[T_A[T_A[Int, Boolean], CC_A[Int]], T_A[(Boolean,Char), T_A[Boolean, (Byte,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)