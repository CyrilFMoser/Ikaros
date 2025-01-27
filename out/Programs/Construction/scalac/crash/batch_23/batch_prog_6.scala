package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Int],(Char,Char)), b: T_A[T_B[C]]) extends T_A[C]
case class CC_B[D](a: T_B[D]) extends T_A[D]
case class CC_C(a: T_A[T_A[Boolean]], b: T_A[T_A[Char]], c: Boolean) extends T_A[T_A[Boolean]]
case class CC_D(a: T_A[T_A[(Byte,Char)]], b: T_B[Boolean], c: T_A[T_A[Boolean]]) extends T_B[Boolean]
case class CC_E(a: CC_A[Int]) extends T_B[Boolean]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),(_,_)), CC_A((_,_), CC_A(_, _))) => 0 
  case CC_A((CC_A(_, _),(_,_)), CC_A((_,_), CC_B(_))) => 1 
  case CC_A((CC_A(_, _),(_,_)), CC_B(_)) => 2 
  case CC_A((CC_B(_),(_,_)), CC_A((_,_), CC_A(_, _))) => 3 
  case CC_A((CC_B(_),(_,_)), CC_A((_,_), CC_B(_))) => 4 
  case CC_A((CC_B(_),(_,_)), CC_B(_)) => 5 
  case CC_B(_) => 6 
}
}