package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C]) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B(a: T_A[CC_A[Byte, Char], T_A[(Boolean,Char), Byte]], b: T_A[Boolean, CC_A[Int, Int]]) extends T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[(Boolean,Byte), T_A[Byte, Int]]]]]
case class CC_C[E]() extends T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[(Boolean,Byte), T_A[Byte, Int]]]]]

val v_a: T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[T_A[(Boolean,Byte), T_A[Byte, Int]], T_A[(Boolean,Byte), T_A[Byte, Int]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}