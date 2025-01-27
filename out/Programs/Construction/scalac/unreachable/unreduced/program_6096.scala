package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Byte,T_A[(Boolean,Byte), Int]), b: (T_B[Byte],T_A[(Byte,Boolean), Boolean])) extends T_A[T_A[D, D], D]
case class CC_B(a: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], b: Boolean, c: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]) extends T_A[T_A[CC_A[T_B[Boolean]], CC_A[T_B[Boolean]]], CC_A[T_B[Boolean]]]
case class CC_C[E, F]() extends T_A[E, F]
case class CC_D(a: T_A[T_A[CC_B, CC_B], T_A[Int, CC_B]], b: T_B[T_A[CC_B, CC_B]], c: CC_C[CC_A[CC_B], CC_C[Byte, CC_B]]) extends T_B[T_B[T_B[CC_B]]]

val v_a: T_A[T_A[CC_A[T_B[Boolean]], CC_A[T_B[Boolean]]], CC_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_C())) => 0 
  case CC_B(CC_A(_, (_,_)), _, CC_A(_, (_,_))) => 1 
  case CC_B(CC_A(_, (_,_)), _, CC_C()) => 2 
  case CC_B(CC_C(), _, CC_A(_, (_,_))) => 3 
  case CC_B(CC_C(), _, CC_C()) => 4 
}
}
// This is not matched: CC_C()