package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Char,Char), (Boolean,Boolean)], T_A], b: Int) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C[C](a: T_B[T_B[CC_B, CC_B], CC_B], b: Char) extends T_B[T_B[C, C], C]
case class CC_D[D](a: D) extends T_B[T_B[D, D], D]

val v_a: T_B[T_B[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _), _), _) => 0 
  case CC_C(CC_C(CC_D(_), _), _) => 1 
  case CC_C(CC_D(CC_B(_, _)), _) => 2 
  case CC_D(CC_B(_, CC_A(_, _))) => 3 
  case CC_D(CC_B(_, CC_B(_, _))) => 4 
}
}