package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[Int], b: T_A[(Boolean,Byte)]) extends T_B[CC_A[T_B[(Boolean,Boolean)], T_B[Boolean]]]
case class CC_C(a: (CC_B,Int)) extends T_B[CC_A[T_B[(Boolean,Boolean)], T_B[Boolean]]]
case class CC_D[E]() extends T_B[CC_A[T_B[(Boolean,Boolean)], T_B[Boolean]]]

val v_a: T_B[CC_A[T_B[(Boolean,Boolean)], T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C((CC_B(_, _),_)) => 1 
  case CC_D() => 2 
}
}