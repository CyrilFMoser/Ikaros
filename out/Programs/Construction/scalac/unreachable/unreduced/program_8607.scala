package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Byte, b: (Int,Boolean)) extends T_A[T_B[T_A[(Char,Byte), (Int,Boolean)]], T_A[T_B[Int], T_B[Int]]]
case class CC_B(a: (CC_A,Char), b: T_A[Int, (CC_A,CC_A)], c: T_B[(Byte,(Byte,Boolean))]) extends T_A[T_B[T_A[(Char,Byte), (Int,Boolean)]], T_A[T_B[Int], T_B[Int]]]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: T_B[E], b: E) extends T_B[E]
case class CC_E[F](a: (T_B[CC_A],T_B[CC_B]), b: T_B[T_A[F, CC_B]]) extends T_B[F]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_B((_,_), _, _)) => 1 
  case CC_D(CC_D(CC_D(_, _), _), CC_B((_,_), _, _)) => 2 
  case CC_D(CC_D(CC_E(_, _), _), CC_B((_,_), _, _)) => 3 
  case CC_D(CC_E(_, CC_C()), CC_B((_,_), _, _)) => 4 
  case CC_D(CC_E(_, CC_D(_, _)), CC_B((_,_), _, _)) => 5 
  case CC_D(CC_E(_, CC_E(_, _)), CC_B((_,_), _, _)) => 6 
  case CC_E(_, _) => 7 
}
}
// This is not matched: CC_D(CC_D(CC_C(), _), CC_B((_,_), _, _))