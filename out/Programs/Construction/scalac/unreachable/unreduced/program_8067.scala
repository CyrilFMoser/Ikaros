package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_B[Boolean, Char]], b: T_A[T_A[Boolean]], c: (T_A[Byte],Byte)) extends T_A[T_A[T_B[Boolean, (Boolean,Int)]]]
case class CC_B[D](a: D, b: D) extends T_B[D, CC_A]
case class CC_C[E, F](a: Char, b: CC_B[F]) extends T_B[E, F]
case class CC_D[H, G](a: T_B[G, H], b: T_B[G, H], c: CC_A) extends T_B[H, G]

val v_a: T_B[T_A[T_A[T_B[Boolean, (Boolean,Int)]]], Byte] = null
val v_b: Int = v_a match{
  case CC_C('x', CC_B(0, _)) => 0 
  case CC_C('x', CC_B(_, _)) => 1 
  case CC_C(_, CC_B(0, _)) => 2 
  case CC_C(_, CC_B(_, _)) => 3 
  case CC_D(_, CC_C('x', CC_B(_, _)), _) => 4 
  case CC_D(_, CC_C(_, CC_B(_, _)), _) => 5 
  case CC_D(_, CC_D(CC_C(_, _), CC_C(_, _), CC_A(_, _, _)), _) => 6 
  case CC_D(_, CC_D(CC_C(_, _), CC_D(_, _, _), CC_A(_, _, _)), _) => 7 
  case CC_D(_, CC_D(CC_D(_, _, _), CC_C(_, _), CC_A(_, _, _)), _) => 8 
  case CC_D(_, CC_D(CC_D(_, _, _), CC_D(_, _, _), CC_A(_, _, _)), _) => 9 
}
}