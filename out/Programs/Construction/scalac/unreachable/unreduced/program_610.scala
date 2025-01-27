package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G](a: T_A[T_B[G, Char], G], b: CC_A[G, G], c: (T_B[(Boolean,Byte), Char],T_A[Boolean, Boolean])) extends T_B[G, T_B[G, G]]
case class CC_C[H, I](a: H, b: (T_A[(Boolean,Boolean), Char],T_A[Byte, Int]), c: Int) extends T_B[H, T_B[H, H]]
case class CC_D[J](a: T_B[J, J], b: T_B[J, J]) extends T_B[CC_C[CC_C[Char, Int], T_A[Boolean, Byte]], T_B[CC_C[CC_C[Char, Int], T_A[Boolean, Byte]], CC_C[CC_C[Char, Int], T_A[Boolean, Byte]]]]

val v_a: T_B[CC_C[CC_C[Char, Int], T_A[Boolean, Byte]], T_B[CC_C[CC_C[Char, Int], T_A[Boolean, Byte]], CC_C[CC_C[Char, Int], T_A[Boolean, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A(), (_,_)) => 0 
  case CC_C(_, (_,_), _) => 1 
  case CC_D(_, _) => 2 
}
}