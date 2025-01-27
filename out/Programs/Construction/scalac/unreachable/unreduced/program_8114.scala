package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_B[T_A[Boolean, Boolean], T_A[Char, (Char,Byte)]], Int]
case class CC_B(a: Byte, b: CC_A[CC_A[Char]], c: CC_A[Char]) extends T_B[T_B[(Int,(Char,Boolean)), T_B[Int, Char]], T_A[CC_A[Boolean], T_B[Int, Boolean]]]
case class CC_C(a: CC_B, b: T_A[CC_A[Byte], T_A[CC_B, CC_B]], c: T_A[T_B[CC_B, (Boolean,Byte)], T_B[Boolean, (Boolean,Boolean)]]) extends T_B[T_B[(Int,(Char,Boolean)), T_B[Int, Char]], T_A[CC_A[Boolean], T_B[Int, Boolean]]]
case class CC_D[F, G](a: CC_C) extends T_B[G, F]

val v_a: T_B[T_B[(Int,(Char,Boolean)), T_B[Int, Char]], T_A[CC_A[Boolean], T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(CC_D(_))) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_) => 2 
}
}