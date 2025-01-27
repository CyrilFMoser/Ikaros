package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Char, Boolean], T_B[Boolean, Boolean]]) extends T_A[T_B[T_A[Boolean, (Char,Boolean)], (Boolean,Boolean)], T_B[T_B[Int, (Int,Int)], T_B[Boolean, Char]]]
case class CC_B(a: (T_B[CC_A, CC_A],Byte), b: Int, c: CC_A) extends T_A[T_B[T_A[Boolean, (Char,Boolean)], (Boolean,Boolean)], T_B[T_B[Int, (Int,Int)], T_B[Boolean, Char]]]
case class CC_C(a: Int, b: (CC_B,Boolean), c: CC_A) extends T_A[T_B[T_A[Boolean, (Char,Boolean)], (Boolean,Boolean)], T_B[T_B[Int, (Int,Int)], T_B[Boolean, Char]]]
case class CC_D[F, E](a: E, b: CC_C) extends T_B[E, F]
case class CC_E[G, H]() extends T_B[H, G]

val v_a: T_A[T_B[T_A[Boolean, (Char,Boolean)], (Boolean,Boolean)], T_B[T_B[Int, (Int,Int)], T_B[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, (CC_B(_, _, _),_), _) => 2 
}
}