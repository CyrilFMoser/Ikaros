package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[(Boolean,Char), Char], T_A[Boolean, Int]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[(Boolean,Char), Char], T_A[Boolean, Int]]]
case class CC_C(a: CC_A[T_A[Byte, Int]], b: (CC_B[(Boolean,Boolean)],CC_A[(Boolean,Char)]), c: CC_B[CC_B[Byte]]) extends T_A[CC_A[CC_B[Int]], T_A[T_A[(Boolean,Char), Char], T_A[Boolean, Int]]]

val v_a: T_A[CC_C, T_A[T_A[(Boolean,Char), Char], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}