package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_B[Boolean, Char], T_B[Byte, Byte]], T_B[Char, T_A[Byte, Int]]]
case class CC_B(a: T_B[CC_A, T_A[CC_A, CC_A]], b: CC_A) extends T_A[T_B[T_B[Boolean, Char], T_B[Byte, Byte]], T_B[Char, T_A[Byte, Int]]]
case class CC_C[E](a: CC_A, b: E, c: (T_B[CC_A, (Int,Char)],T_A[Char, Boolean])) extends T_A[T_B[T_B[Boolean, Char], T_B[Byte, Byte]], T_B[Char, T_A[Byte, Int]]]
case class CC_D[G, F](a: CC_A) extends T_B[G, F]

val v_a: T_A[T_B[T_B[Boolean, Char], T_B[Byte, Byte]], T_B[Char, T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), _, (CC_D(_),_)) => 2 
}
}