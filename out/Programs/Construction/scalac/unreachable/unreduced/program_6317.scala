package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Char],T_B[Byte]), b: T_A[T_B[D], D]) extends T_A[D, T_B[(Boolean,Byte)]]
case class CC_B[E](a: ((Boolean,(Boolean,Int)),Char), b: T_B[E]) extends T_B[E]
case class CC_C[F](a: T_A[T_B[F], F], b: T_B[F]) extends T_B[F]
case class CC_D[G](a: Boolean) extends T_B[G]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(((_,_),'x'), CC_B((_,_), _)) => 0 
  case CC_B(((_,_),_), CC_B((_,_), _)) => 1 
  case CC_B(((_,_),'x'), CC_C(_, CC_B(_, _))) => 2 
  case CC_B(((_,_),_), CC_C(_, CC_B(_, _))) => 3 
  case CC_B(((_,_),'x'), CC_C(_, CC_C(_, _))) => 4 
  case CC_B(((_,_),_), CC_C(_, CC_C(_, _))) => 5 
  case CC_B(((_,_),'x'), CC_C(_, CC_D(_))) => 6 
  case CC_B(((_,_),_), CC_C(_, CC_D(_))) => 7 
  case CC_B(((_,_),'x'), CC_D(_)) => 8 
  case CC_B(((_,_),_), CC_D(_)) => 9 
}
}