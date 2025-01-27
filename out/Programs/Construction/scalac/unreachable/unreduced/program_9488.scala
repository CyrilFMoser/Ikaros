package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_B[Boolean],T_B[(Boolean,Char)])) extends T_A[T_A[T_B[Byte], T_B[Boolean]], T_B[T_A[Byte, Char]]]
case class CC_B(a: Boolean, b: T_B[T_A[CC_A, Boolean]], c: CC_A) extends T_A[T_A[T_B[Byte], T_B[Boolean]], T_B[T_A[Byte, Char]]]
case class CC_C(a: ((CC_A,(Byte,Boolean)),T_A[(Int,Byte), CC_A]), b: (CC_B,T_B[(Byte,Int)])) extends T_A[T_A[T_B[Byte], T_B[Boolean]], T_B[T_A[Byte, Char]]]
case class CC_D[D, E](a: CC_C, b: Byte) extends T_B[D]
case class CC_E[F]() extends T_B[F]
case class CC_F[G]() extends T_B[G]

val v_a: T_A[T_A[T_B[Byte], T_B[Boolean]], T_B[T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _),CC_D(_, _))) => 0 
  case CC_A((CC_D(_, _),CC_E())) => 1 
  case CC_A((CC_D(_, _),CC_F())) => 2 
  case CC_A((CC_E(),CC_D(_, _))) => 3 
  case CC_A((CC_E(),CC_E())) => 4 
  case CC_A((CC_E(),CC_F())) => 5 
  case CC_A((CC_F(),CC_D(_, _))) => 6 
  case CC_A((CC_F(),CC_E())) => 7 
  case CC_B(_, CC_D(CC_C(_, _), _), _) => 8 
  case CC_B(_, CC_E(), _) => 9 
  case CC_B(_, CC_F(), _) => 10 
  case CC_C(((_,_),_), (CC_B(_, _, _),CC_D(_, _))) => 11 
  case CC_C(((_,_),_), (CC_B(_, _, _),CC_E())) => 12 
  case CC_C(((_,_),_), (CC_B(_, _, _),CC_F())) => 13 
}
}
// This is not matched: CC_A((CC_F(),CC_F()))