package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, T_A[E, E]], c: T_B[E, E]) extends T_A[E, (T_B[Byte, Boolean],T_A[Boolean, Char])]
case class CC_B[F](a: F, b: (Boolean,T_A[Int, Byte])) extends T_B[F, (T_B[Boolean, Byte],T_A[Byte, Int])]
case class CC_C[G](a: G) extends T_B[G, (T_B[Boolean, Byte],T_A[Byte, Int])]
case class CC_D[H](a: Char, b: Boolean, c: Byte) extends T_B[H, (T_B[Boolean, Byte],T_A[Byte, Int])]

val v_a: T_B[Boolean, (T_B[Boolean, Byte],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_)) => 0 
  case CC_C(true) => 1 
  case CC_C(false) => 2 
  case CC_D(_, true, 0) => 3 
  case CC_D(_, false, 0) => 4 
  case CC_D(_, true, _) => 5 
  case CC_D(_, false, _) => 6 
}
}