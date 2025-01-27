package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[G, F](a: CC_A[G, Byte]) extends T_A[F, G]
case class CC_C(a: Boolean) extends T_B[T_A[T_B[Char], (Int,Boolean)]]
case class CC_D(a: CC_B[(CC_C,Char), T_B[(Char,Char)]], b: T_A[T_A[CC_C, CC_C], T_A[CC_C, CC_C]], c: T_B[T_A[CC_C, CC_C]]) extends T_B[T_A[T_B[Char], (Int,Boolean)]]

val v_a: T_B[T_A[T_B[Char], (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_A(), _) => 1 
  case CC_D(_, CC_B(_), _) => 2 
}
}