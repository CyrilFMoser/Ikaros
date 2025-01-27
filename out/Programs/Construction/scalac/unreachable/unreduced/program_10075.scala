package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D]() extends T_A[Int, D]
case class CC_C[E]() extends T_A[E, CC_B[E]]
case class CC_D[F](a: Int) extends T_B
case class CC_E(a: (CC_B[T_B],T_A[Int, T_B]), b: (Boolean,T_B)) extends T_B
case class CC_F(a: T_A[Int, T_A[Int, CC_E]], b: T_A[(T_B,CC_E), CC_A[T_B]], c: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E((CC_B(),CC_A()), (_,CC_D(_))) => 1 
  case CC_E((CC_B(),CC_B()), (_,CC_D(_))) => 2 
  case CC_E((CC_B(),CC_A()), (_,CC_E(_, _))) => 3 
  case CC_E((CC_B(),CC_B()), (_,CC_E(_, _))) => 4 
  case CC_E((CC_B(),CC_A()), (_,CC_F(_, _, _))) => 5 
  case CC_E((CC_B(),CC_B()), (_,CC_F(_, _, _))) => 6 
  case CC_F(CC_A(), _, CC_E((_,_), (_,_))) => 7 
  case CC_F(CC_B(), _, CC_E((_,_), (_,_))) => 8 
}
}