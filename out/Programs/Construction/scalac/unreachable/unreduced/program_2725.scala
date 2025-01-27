package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[CC_A[Int]], b: Int) extends T_B[CC_A[T_A[(Boolean,Char)]], T_B[T_B[Boolean, Int], T_A[Int]]]
case class CC_C() extends T_B[CC_A[T_A[(Boolean,Char)]], T_B[T_B[Boolean, Int], T_A[Int]]]
case class CC_D() extends T_B[CC_A[T_A[(Boolean,Char)]], T_B[T_B[Boolean, Int], T_A[Int]]]

val v_a: T_B[CC_A[T_A[(Boolean,Char)]], T_B[T_B[Boolean, Int], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}