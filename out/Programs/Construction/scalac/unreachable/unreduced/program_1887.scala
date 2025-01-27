package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_A[Byte]], b: T_A[T_A[(Boolean,Char)]]) extends T_A[T_A[(Byte,Byte)]]
case class CC_B[D](a: CC_A, b: T_A[D], c: (T_A[CC_A],T_B[CC_A, CC_A])) extends T_B[T_A[D], D]
case class CC_C(a: Int, b: Byte) extends T_B[T_A[CC_A], CC_A]
case class CC_D() extends T_B[T_A[CC_A], CC_A]

val v_a: T_B[T_A[CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,_)) => 0 
  case CC_C(_, 0) => 1 
  case CC_C(_, _) => 2 
  case CC_D() => 3 
}
}