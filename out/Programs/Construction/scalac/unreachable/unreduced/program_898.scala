package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Boolean,Byte), T_A[Boolean, Int]]]
case class CC_B[D](a: T_A[D, CC_A[Int]], b: CC_A[D]) extends T_A[D, T_A[(Boolean,Byte), T_A[Boolean, Int]]]

val v_a: T_A[Int, T_A[(Boolean,Byte), T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}